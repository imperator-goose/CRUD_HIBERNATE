package Repository.Impl;

import Model.Developer;
import Repository.DeveloperRepository;
import config.HibernateConnectionConfig;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class DeveloperRepositoryImpl implements DeveloperRepository {
    @Override
    public Developer save(Developer developer) {
        try (Session session = HibernateConnectionConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(developer);
            transaction.commit();
        }
        return developer;
    }

    @Override
    public Developer getById(Integer id) {
        try (Session session = HibernateConnectionConfig.getSession()) {
            String getByIdHqlQuery = "" +
                    "FROM DeveloperEntity a " +
                    "LEFT JOIN FETCH a.skill, a.specialty WHERE a.id = :developerId";
            final Query<Developer> query = session.createQuery(getByIdHqlQuery, Developer.class);
            query.setParameter("developerId", id);
            return query.getSingleResult();
        }
    }

    @Override
    public List<Developer> getAll() {
        try (Session session = HibernateConnectionConfig.getSession()) {
            String getAllHqlQuery =
                    "SELECT a FROM Developer a JOIN FETCH a.specialty p join FETCH a.skill f";
            return session.createQuery(getAllHqlQuery, Developer.class).getResultList();
        }
    }

    @Override
        public Developer update(Developer developer, Integer id) {
        try (Session session = HibernateConnectionConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            Developer developerToUpdate = session.get(Developer.class, id);
            developerToUpdate.setLastName(developer.getLastName());
            developerToUpdate.setFirstName(developer.getFirstName());
            session.merge(developerToUpdate);
            transaction.commit();
        }
        return developer;
    }

    @Override
    public Developer deleteById(Integer id) {
        try (Session session = HibernateConnectionConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            Developer developerForDelete = session.get(Developer.class, id);
            session.remove(developerForDelete);
            transaction.commit();
            return developerForDelete;
        }
    }

}

package Repository.Impl;

import Model.Specialty;
import Repository.SpecialtyRepository;
import config.HibernateConnectionConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class SpecialtyRepositoryImpl implements SpecialtyRepository {

    @Override
    public Specialty getById(Integer id) {
        try(Session session = HibernateConnectionConfig.getSession()){
            String getByIdHqlQuery = "FROM Specialty a WHERE a.id = :specialtyId";
            final Query<Specialty> query = session.createQuery(getByIdHqlQuery, Specialty.class);
            query.setParameter("specialtyId", id);
            return query.getSingleResult();
        }
    }

    @Override
    public Specialty deleteById(Integer id) {
        try (Session session = HibernateConnectionConfig.getSession()) {

            Transaction transaction = session.beginTransaction();
            Specialty specialtyForDelete = session.get(Specialty.class, id);
            session.remove(specialtyForDelete);
            transaction.commit();
            return specialtyForDelete;
        }
    }

    @Override
    public Specialty save(Specialty specialty) {
        try (Session session = HibernateConnectionConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(specialty);
            transaction.commit();
        }

        return specialty;
    }

    @Override
    public Specialty update(Specialty specialty, Integer id) {
        try (Session session = HibernateConnectionConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            Specialty specialtyEntityForUpdate = session.get(Specialty.class, id);
            specialtyEntityForUpdate.setName(specialtyEntityForUpdate.getName());
            session.merge(specialtyEntityForUpdate);
            transaction.commit();
        }
        return specialty;
    }

    @Override
    public List<Specialty> getAll() {
        try(Session session = HibernateConnectionConfig.getSession()){
            return session.createQuery("SELECT a FROM Specialty a", Specialty.class).getResultList();
        }
    }

    public static void main(String[] args) {
        SpecialtyRepositoryImpl specialtyRepository = new SpecialtyRepositoryImpl();
        Specialty specialty = new Specialty(1, "gfff");
        specialtyRepository.save(specialty);
    }
}

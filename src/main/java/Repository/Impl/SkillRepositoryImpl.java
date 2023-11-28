package Repository.Impl;

import Model.Skill;
import Repository.SkillRepository;
import config.HibernateConnectionConfig;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class SkillRepositoryImpl implements SkillRepository {

    @Override
    public Skill getById(Integer id) {
        try (Session session = HibernateConnectionConfig.getSession()) {
            String getByIdHqlQuery = "FROM Skill a WHERE a.id = :skillId";
            final Query<Skill> query = session.createQuery(getByIdHqlQuery, Skill.class);
            query.setParameter("skillId", id);
            return query.getSingleResult();
        }
    }


    @Override
    public Skill deleteById(Integer id) {
        try (Session session = HibernateConnectionConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            Skill skillForDelete = session.get(Skill.class, id);
            session.remove(skillForDelete);
            transaction.commit();
            return skillForDelete;
        }
    }


    @Override
    public Skill save(Skill skill) {
        try (Session session = HibernateConnectionConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(skill);
            transaction.commit();
        }
        return skill;
    }


    @Override
    public Skill update(Skill skill, Integer id) {
        try (Session session = HibernateConnectionConfig.getSession()) {
            Transaction transaction = session.beginTransaction();
            Skill skillForUpdate = session.get(Skill.class, id);
            skillForUpdate.setName(skill.getName());
            session.merge(skillForUpdate);
            transaction.commit();
        }
        return skill;
    }

    @Override
    public List<Skill> getAll() {
        try(Session session = HibernateConnectionConfig.getSession()){
            return session.createQuery("SELECT a FROM SkillEntity a", Skill.class).getResultList();
        }
    }
}

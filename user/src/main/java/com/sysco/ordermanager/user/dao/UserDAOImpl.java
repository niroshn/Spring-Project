package com.sysco.ordermanager.user.dao;

import com.sysco.ordermanager.common.config.AbstractDAO;
import com.sysco.ordermanager.user.model.User;
import org.springframework.stereotype.Repository;


import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@Repository("userDAO")
@Transactional
public class UserDAOImpl extends AbstractDAO<Integer, User> implements UserDAO {

    public User findById(int id) {

        return (User) getByKey(id);
    }

    public User findBySSO(String sso) {
        System.out.println("SSO : " + sso);
        try {
            User user = (User) getEntityManager()
                    .createQuery("SELECT u FROM User u WHERE u.ssoId LIKE :ssoId")
                    .setParameter("ssoId", sso)
                    .getSingleResult();

            if (user != null) {
//                initializeCollection(user.getUserProfiles());
            }
            return user;
        } catch (NoResultException ex) {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public List<User> findAllUsers() {
        return (List<User>) getEntityManager()
                .createQuery("SELECT u FROM User u ORDER BY u.firstName ASC")
                .getResultList();
    }


    public void save(User user) {
        persist(user);
    }

    public void deleteBySSO(String sso) {
        User user = (User) getEntityManager()
                .createQuery("SELECT u FROM User u WHERE u.ssoId LIKE :ssoId")
                .setParameter("ssoId", sso)
                .getSingleResult();
        delete(user);
    }

    //An alternative to Hibernate.initialize()
    protected void initializeCollection(Collection<?> collection) {
        if (collection == null) {
            return;
        }
        collection.iterator().hasNext();
    }

}
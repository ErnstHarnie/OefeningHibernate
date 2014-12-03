/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO.Services;

import dal.HibernateUtil;
import dal.TblCursist;
import oefeningstudentbeheersysteem.Cursist;
import org.hibernate.Session;

/**
 *
 * @author Ernst
 */
public class StudentService {

    public void CursistToevoegen(TblCursist cursist) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(cursist);
        session.getTransaction().commit();
    }

}

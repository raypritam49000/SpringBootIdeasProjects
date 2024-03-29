package com.javatechie.jpastreamer.entity;

import com.speedment.jpastreamer.field.DoubleField;
import com.speedment.jpastreamer.field.IntField;
import com.speedment.jpastreamer.field.StringField;

/**
 * The generated base for entity {@link Employee} representing entities of the
 * {@code employee}-table in the database.
 * <p> This file has been automatically generated by JPAStreamer.
 * 
 * @author JPAStreamer
 */
public final class Employee$ {
    
    /**
     * This Field corresponds to the {@link Employee} field name.
     */
    public static final StringField<Employee> name = StringField.create(
        Employee.class,
        "name",
        Employee::getName,
        false
    );
    /**
     * This Field corresponds to the {@link Employee} field dept.
     */
    public static final StringField<Employee> dept = StringField.create(
        Employee.class,
        "dept",
        Employee::getDept,
        false
    );
    /**
     * This Field corresponds to the {@link Employee} field id.
     */
    public static final IntField<Employee> id = IntField.create(
        Employee.class,
        "id",
        Employee::getId,
        false
    );
    /**
     * This Field corresponds to the {@link Employee} field salary.
     */
    public static final DoubleField<Employee> salary = DoubleField.create(
        Employee.class,
        "salary",
        Employee::getSalary,
        false
    );
}
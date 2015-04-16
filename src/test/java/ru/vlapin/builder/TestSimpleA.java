package ru.vlapin.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Vyacheslav Lapin (http://vlapin.ru/)
 * @version 0.1 (15.04.2015 12:56).
 */
public class TestSimpleA {

    @Test
    public void testGetBuilder() throws Exception {

        assertEquals(
                "���� ���� ����, ���� �� � �� ���������",
                SimpleA.getBuilder("���� ���� ����")
                        .setOptionalField("���� �� � �� ���������").build().toString());

        assertEquals(
                "���� ���� ����, ���� �� � �� ���������",
                SimpleA.getBuilder("���� ���� ����")
                        .setOptionalField("���� �� � �� ���������").build().toString());
    }
}
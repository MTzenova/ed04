package org.example;

import java.util.*;
/** Método Agenda
 * @author Mónica Tzenova Ivanova
 * @version 1.0
 * @since 01/03/24
 * @see Contacto
 */
public class Agenda implements IAgenda {
    private List<Contacto> contacts; // Lista de Contacto

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getPersona().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    @Override
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getPersona().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getPersona().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    @Override
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}
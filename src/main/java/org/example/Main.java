package org.example;

public class Main {
    public static void main(String[] args) {
        initAgenda();
    }

    private static void initAgenda() {
        // Crear una nueva agendaContactos.
        Agenda agendaContactos = new Agenda();

        // Añadir contactos a la agendaContactos.
        agendaContactos.addContact("John Doe", "1234567890");
        agendaContactos.addContact("Jane Doe", "9876543210");
        agendaContactos.addContact("Mary Jane", "1122334455");

        // Imprimir todos los contactos de la agendaContactos.
        System.out.println("Todos los contactos: ");
        for (Contacto c : agendaContactos.getContacts()) {
            System.out.println(c.getPersona() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente.
        agendaContactos.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agendaContactos.
        agendaContactos.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agendaContactos.
        agendaContactos.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Contacto c : agendaContactos.getContacts()) {
            System.out.println(c.getPersona() + " -> " + c.getPhones());
        }
    }
}
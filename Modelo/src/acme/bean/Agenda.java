package acme.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
public class Agenda {
  // Devolver todos los contactos
  List<Contacto> contacts = new ArrayList();

  public List<Contacto> findAllContacts() {
    return contacts;
  }

  // Devolver todos los contactos que coincidan con el
  // nombre (sin distinción entre mayúsculas y minúsculas)
  public List<Contacto> findContactsByName(String name) {
    String namePattern = ".*" + (name != null ? name.toUpperCase() : "") + ".*";
    List<Contacto> matches = new ArrayList();
    for (Contacto c : contacts) {
      if (Pattern.matches(namePattern, c.getNombre().toUpperCase())) {
matches.add(c);
      }
    }
    return matches;
  }

  public Agenda() {
    contacts.add(new Contacto("Jeff", "jeff@acme.org"));
    contacts.add(new Contacto("Charles", "cyoung@acme.org"));
    contacts.add(new Contacto("Gary", "gary@acme.org"));
    contacts.add(new Contacto("Yvonne", "yvonne_yvonne@acme.org"));
    contacts.add(new Contacto("Sung", "superstar001@acme.org"));
    contacts.add(new Contacto("Shailyn", "spatellina@acme.org"));
    contacts.add(new Contacto("John", "jjb@acme.org"));
    contacts.add(new Contacto("Ricky", "rmartz@acme.org"));
    contacts.add(new Contacto("Shaoling", "shaoling@acme.org"));
    contacts.add(new Contacto("Olga", "olga077@acme.org"));
    contacts.add(new Contacto("Ron", "regert@acme.org"));
    contacts.add(new Contacto("Juan", "jperen@acme.org"));
    contacts.add(new Contacto("Uday", "udaykum@acme.org"));
    contacts.add(new Contacto("Amin", "amin@acme.org"));
    contacts.add(new Contacto("Sati", "sparek@acme.org"));
    contacts.add(new Contacto("Kal", "kalyane.kushnane@acme.org"));
    contacts.add(new Contacto("Prakash", "prakash01@acme.org"));
  }
}
package javaEjemplo1;

public class Persona {
private String nombre;
private String apellido;
private int edad;

public String saludar() {
	return "Hola soy "+ nombre + " y mi apellido es "+ apellido+ " tengo "+ edad + "años";
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}
}

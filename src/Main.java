import java.util.*;
import Data.Active;
import Data.Perfil;
import Data.Rol;
import Data.Usuario;

public class Main {
    public static void main(String[] args) {
        // Crear algunos activos
        Active servidor = new Active("Servidor01", "Servidor de Archivos", "XYZ123", "Sala de TI", "Operativo", "micky", "20/02/2024");
        Active laptop = new Active("Laptop001", "Laptop para empleados", "ABC456", "Oficina 101", "Operativo", "santiago", "31/01/2024");

        // Crear algunos roles
        Rol adminSistema = new Rol("Administrador de Sistemas", "Acceso completo a todos los sistemas y activos de IT");
        Rol usuarioFinal = new Rol("Usuario Final", "Acceso limitado a los sistemas y activos necesarios para el trabajo diario");

        // Crear algunos perfiles y asignar roles
        Perfil perfilAdmin = new Perfil("AdminIT", "Perfil de Administrador de IT");
        perfilAdmin.agregarRol(adminSistema);
        perfilAdmin.agregarRol(usuarioFinal);

        Perfil perfilUsuario = new Perfil("UsuarioEstándar", "Perfil de Usuario Estándar");
        perfilUsuario.agregarRol(usuarioFinal);

        // Crear algunos usuarios y asignar perfiles
        Usuario usuario1 = new Usuario("usuario1", "Usuario Uno", "usuario1@ztrust.com", perfilAdmin);
        Usuario usuario2 = new Usuario("usuario2", "Usuario Dos", "usuario2@ztrust.com", perfilUsuario);

        // Mostrar información
        System.out.println("Información del activo - Servidor:");
        System.out.println("Nombre: " + servidor.getNombre());
        System.out.println("Descripción: " + servidor.getDescripcion());
        System.out.println("Número de Serie: " + servidor.getNumeroSerie());
        System.out.println("Ubicación: " + servidor.getUbicacion());
        System.out.println("Estado: " + servidor.getEstado());

        System.out.println("\nRoles disponibles:");
        System.out.println("1. " + adminSistema.getNombre() + ": " + adminSistema.getDescripcion());
        System.out.println("2. " + usuarioFinal.getNombre() + ": " + usuarioFinal.getDescripcion());

        System.out.println("\nPerfiles disponibles:");
        System.out.println("1. " + perfilAdmin.getNombre() + ": " + perfilAdmin.getDescripcion());
        System.out.println("2. " + perfilUsuario.getNombre() + ": " + perfilUsuario.getDescripcion());

        System.out.println("\nUsuarios:");
        System.out.println("Usuario 1:");
        System.out.println("Nombre de usuario: " + usuario1.getNombreUsuario());
        System.out.println("Nombre completo: " + usuario1.getNombreCompleto());
        System.out.println("Correo electrónico: " + usuario1.getCorreoElectronico());
        System.out.println("Perfil: " + usuario1.getPerfil().getNombre());

        System.out.println("\nUsuario 2:");
        System.out.println("Nombre de usuario: " + usuario2.getNombreUsuario());
        System.out.println("Nombre completo: " + usuario2.getNombreCompleto());
        System.out.println("Correo electrónico: " + usuario2.getCorreoElectronico());
        System.out.println("Perfil: " + usuario2.getPerfil().getNombre());
    }
}

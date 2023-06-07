package org.academiadecodigo.bootcamp;

public class main {
    public static void main(String[] args){

        FileManager files = new FileManager(3);


        try {
            files.login();
        } catch (NotEnoughPermissionException e) {
            throw new RuntimeException(e);
        }

        try {
            files.createFile("test");
        } catch (NotEnoughSpaceException e) {
            throw new RuntimeException(e);
        } catch (NotEnoughPermissionException e) {
            throw new RuntimeException(e);
        }

        try {
            files.createFile("test");
        } catch (NotEnoughSpaceException e) {
            throw new RuntimeException(e);
        } catch (NotEnoughPermissionException e) {
            throw new RuntimeException(e);
        }

        try {
            files.createFile("test");
        } catch (NotEnoughSpaceException e) {
            throw new RuntimeException(e);
        } catch (NotEnoughPermissionException e) {
            throw new RuntimeException(e);
        }

        try {
            files.createFile("test");
        } catch (NotEnoughSpaceException e) {
            System.out.println("batata2");
        } catch (NotEnoughPermissionException e) {
            System.out.println("batata");
        }


    }
}

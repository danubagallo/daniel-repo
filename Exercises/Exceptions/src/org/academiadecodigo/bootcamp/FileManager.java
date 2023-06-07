package org.academiadecodigo.bootcamp;

import java.io.FileNotFoundException;

public class FileManager {

    private boolean isLoggedIn;
    private File[] files;
    public static int totalFiles = 0;

    public FileManager(int memorySpace) {
        isLoggedIn = false;
        files = new File[memorySpace];
    }

    public void login() throws NotEnoughPermissionException {
        if (isLoggedIn == true) {
            throw new NotEnoughPermissionException("Already logged in.");
        } else {
            isLoggedIn = true;
            System.out.println("Logged in successfully.");
        }
    }

    public void logout() throws NotEnoughPermissionException {
        if (isLoggedIn == false) {
            throw new NotEnoughPermissionException("Cannot logout. Log in first.");
        } else {
            isLoggedIn = false;
            System.out.println("Logged out successfully.");
        }

    }

    public void createFile(String fileName) throws NotEnoughSpaceException, NotEnoughPermissionException {
        if (isLoggedIn == false) {
            throw new NotEnoughPermissionException("Log in first.");
        } else if (totalFiles >= files.length) {
            throw new NotEnoughSpaceException("Hard disk full. Delete files.");
        } else {
            files[totalFiles] = new File(fileName);
            totalFiles++;
            System.out.println("File created. Total files inside file manager: " + totalFiles);
        }

    }

    public File getFile(String thisFileName) throws NotEnoughPermissionException, org.academiadecodigo.bootcamp.FileNotFoundException {
        if (isLoggedIn == false) {
            throw new NotEnoughPermissionException("Log in first.");
        } else {
            for (int i = 0; i < files.length; i++) {
                if (thisFileName == files[i].getName()) {
                    return files[i];
                } else {

                }
            }
            throw new org.academiadecodigo.bootcamp.FileNotFoundException("File not found.");

        }

    }
}

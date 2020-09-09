package ru.mirea.lab2.author;

public class TestAuthor {
    public static void main(String[] args){
        Author Alex;
        Alex = new Author("Alex", "alex@alex.com", 'm' );
        System.out.println(Alex);
        System.out.println(Alex.getEmail());
        Alex.setEmail("alex@gmail.com");
        System.out.println(Alex.getEmail());
        System.out.println(Alex.toString());
    }
}
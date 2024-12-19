// Assignement
// -----------

// Checked Exceptions

// 1.IOException

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to read from a non-existent file
            BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            // Handle the IOException
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

// 2.FileNotFoundException

import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to open a file that does not exist
            FileReader file = new FileReader("missingfile.txt");
        } catch (FileNotFoundException e) {
            // Handle the exception
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

// 3.EOFException

import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("emptyfile.txt"))) {
            while (true) {
                System.out.println(dis.readUTF()); // Reading beyond file contents
            }
        } catch (EOFException e) {
            System.out.println("Reached the end of the file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}

// 4. SQLException

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to connect to a non-existent database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "user", "password");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}

// 5. ClassNotFoundException

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to load a class that doesn't exist
            Class.forName("com.nonexistent.Class");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
// ----------------------------------------------

//  Unchecked Exceptions

// 6.ArithmeticException

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }
    }
}

// 7.NullPointerException

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // Accessing a null reference
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        }
    }
}

// 8.ArrayIndexOutOfBoundsException

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Accessing invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }
    }
}

// 9. ClassCastException

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            Object obj = "String";
            Integer num = (Integer) obj; // Invalid type cast
        } catch (ClassCastException e) {
            System.out.println("Class cast exception: " + e.getMessage());
        }
    }
}

// 10. IllegalArgumentException

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            setAge(-1); // Invalid argument
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }
}

// 11. NumberFormatException

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc"); // Invalid string format for number
        } catch (NumberFormatException e) {
            System.out.println("Number format exception: " + e.getMessage());
        }
    }
}






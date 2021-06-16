package main.java.tests;

class ThrowInFinally {
    void test() {
        try {
        } finally {
            throw new RuntimeException();
        }
    }
    void test2() {
        throw new RuntimeException();
    }
}
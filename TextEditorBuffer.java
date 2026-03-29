class TextEditorBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // append
        sb.append(" World");

        // insert
        sb.insert(5, " Java");

        // reverse
        sb.reverse();

        System.out.println("Final String: " + sb);
    }
}
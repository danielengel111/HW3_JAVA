public interface Observer {
    /**
     * print a message sent by subject
     * to this observer
     */
    public void update(String message);
}

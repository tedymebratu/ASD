public interface Subject {
    public void attach(Object object);
    public void detach(Object object);
    public void notify(Object object);
}

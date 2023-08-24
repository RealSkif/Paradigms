package seminar_3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NotificationSystem {
    private String news;
    private PropertyChangeSupport support;

    public NotificationSystem() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void setNews(String value) {
        support.firePropertyChange("news", this.news, value);
        this.news = value;
    }
}

class NotificationListener implements PropertyChangeListener {
    private String name;

    public NotificationListener(String name) {
        this.name = name;
    }

    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

    public void setNews(String news) {
        System.out.println(name + "heard of: " + news);
    }
}

class Test {
    public static void main(String[] args) {
        NotificationSystem observable = new NotificationSystem();

        observable.addPropertyChangeListener(new NotificationListener("Bob"));
        observable.addPropertyChangeListener(new NotificationListener("Ann"));

        observable.setNews("News one");
        observable.setNews("News two");
    }
}

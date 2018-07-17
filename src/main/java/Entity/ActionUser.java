package Entity;

import Entity.Link;

public interface ActionUser {
    void read();
    void addLink(Link link);
    void delLink(String tittle);
    void editLink(Link link);
}

package com.example.demo;

import java.util.Set;

public class Repo {
    private long id;
    private String name;
    private User user;
    private String pulls_url;
    private long forks;
    private long traffic_views_uniques;
    private long traffic_clones_uniques;

    private Set<String> languages;
    private Set<String> pulls;

    public long getForks() {
        return forks;
    }

    public void setForks(long forks) {
        this.forks = forks;
    }
    public String getPulls_url() {
        return pulls_url;
    }

    public void setPulls_url(String pulls_url) {
        this.pulls_url = pulls_url;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public long getTraffic_views_uniques() {
        return traffic_views_uniques;
    }

    public void setTraffic_views_uniques(long traffic_views_uniques) {
        this.traffic_views_uniques = traffic_views_uniques;
    }

    public long getTraffic_clones_uniques() {
        return traffic_clones_uniques;
    }

    public void setTraffic_clones_uniques(long traffic_clones_uniques) {
        this.traffic_clones_uniques = traffic_clones_uniques;
    }

    public Set<String> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<String> languages) {
        this.languages = languages;
    }

    public Set<String> getPulls() {
        return pulls;
    }

    public void setPulls(Set<String> pulls) {
        this.pulls = pulls;
    }

    @Override
    public String toString(){
        return "{" +
                "name='"+ name +
                "pulls_url=" + pulls_url +
                "forks=" + forks+
                "}";
    }
}

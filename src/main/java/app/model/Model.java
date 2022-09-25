package app.model;

import app.entity.UserApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {

    private static Model instance = new Model();

    private List<UserApp> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(UserApp user) {
        model.add(user);
    }

    public void remove(UserApp user) {
        model.remove(user);
    }


    public List<String> list() {
        return model.stream()
                .map(UserApp::getName)
                .collect(Collectors.toList());
    }
}
package service;

import model.Tutorial;

import java.util.List;

public interface TutorialService {
    public Tutorial createTutorial(Tutorial product);
    public List<Tutorial> fetchTutorial();
    public Tutorial getTutorial(Integer id);
    public Tutorial updateTutorial(Tutorial tutorial);

    public Tutorial deleteTutorial(long id);
}

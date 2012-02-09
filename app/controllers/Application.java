package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void interview() {
        render();
    }

    public static void postAssessmentData(String scale, int value, String time) {
        System.out.println(String.format("scale: %s, value: %s, time: %s", scale, value, time));
    }
}

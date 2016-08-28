package edu.up.swolemate;

/**
 * Created by Nathan on 1/21/2015.
 */
public class CardioWorkout extends BaseWorkout {
    /**
     * The duration of the workout in seconds
     */
    protected double duration;

    /**
     * The distance of the workout in miles
     */
    protected double distance;


    /**
     * Initializes an empty CardioWorkout object
     */
    public CardioWorkout() {
        super();
    }

    /**
     * Initializes a CardioWorkout with the specified name
     * @param name
     */
    public CardioWorkout(String name) {
        super(name);
    }

    /**
     * gets the duration of the cardio workout
     * @return
     */
    public double getDuration() {
        return duration;
    }

    /**
     * sets the duration of the workout
     * @param duration
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * Gets the distance of the workout
     * @return
     */
    public double getDistance() {
        return distance;
    }

    /**
     * sets the distance of the workout
     * @param distance
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Initializes a CardioWorkout with the specified name and duration

     * @param name
     * @param duration
     */
    public CardioWorkout(String name, double duration) {
        super(name);
        this.duration = duration;
    }
}

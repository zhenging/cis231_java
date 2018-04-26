/**
 * Lab 14
 * CIS 231 / Cuesta College
 * Spring 2018 / R. Scovil
 * Zhongyuan Zheng / zhongyuan_zheng@my.cuesta.edu
 */

package com.cuesta;

public class Lab14ZYZheng {

    // Define the Game class to be an inner class, so the file name can conform
    // to naming convention "Lab14XXxx"
    public class Game {
        // declare instance variables here
        private String homeTeam;

        private String visTeam;

        private int homeScore;

        private int visScore;

        // write the answer to "c" here
        public Game(String homeTeam, String visTeam, int homeScore, int visScore) {
            // The editor just keeps popping up warning if I don't add "this".
            // Though we don't have to.
            // The scope of the variable on the left is the Game Class.
            // The scope of the variable on the right is the constructor method.
            this.homeTeam = homeTeam;
            this.visTeam = visTeam;
            this.homeScore = homeScore;
            this.visScore = visScore;
        }

        // write the answer to "d" here
        public String getHomeTeam() {
            return homeTeam;
        }

        public String getVisTeam() {
            return visTeam;
        }

        public int getHomeScore() {
            return homeScore;
        }

        public int getVisScore() {
            return visScore;
        }

        // write the answer to "e" here
        public void setHomeTeam(String homeTeam) {
            this.homeTeam = homeTeam;
        }

        public void setVisTeam(String visTeam) {
            this.visTeam = visTeam;
        }

        public void setHomeScore(int homeScore) {
            this.homeScore = homeScore;
        }

        public void setVisScore(int visScore) {
            this.visScore = visScore;
        }

        // write the answer to "f" here
        @Override
        public String toString() {
            if (homeScore >= visScore) {
                return homeTeam + ": " + homeScore + ", " + visTeam + ": " + visScore;
            } else {
                return visTeam + ": " + visScore + ", " + homeTeam + ": " + homeScore;
            }
        }
    }
}

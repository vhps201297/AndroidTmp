package com.example.mvpexampletest;

public interface ViewMain {

    interface mainInteractor{
        public void setName(String name);
        public String getName();
        public void setLastName(String lastName);
        public String getLastName();
        public void login();
    }

    interface mainView{
        void enableDashboard();
        void disableDashboard();
        void showProgress();
        void dismissProgress();
        void goToProfile();
        void goToEditInfo();
    }
}

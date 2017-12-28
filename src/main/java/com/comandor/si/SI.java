package com.comandor.si;

import com.comandor.session.Session;

public class SI {

    public static void run() {
        Session session = new Session();
        session.start();
        session.close();
    }
}

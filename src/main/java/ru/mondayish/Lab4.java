package ru.mondayish;

// var. 286464
public class Lab4 {
    public static void main(String[] args) {
        C a = new C();
        C b = new H();
        H c = new H();
        a.m14();
        a.m15();
        a.m41();
        a.m16();
        c.m49();
        a.m5();
        b.m17();
        c.m4();
        b.m19();
        b.m32();
        c.m27(a);
        a.m27(b);
        c.m27(c);
        c.m46();
        c.m28();
        c.m20();
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        H d = new H();
                        d.m42();
                        Thread.sleep(9);
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
}
class C {
    int m50;
    int m36;
    int m8;
    int m13;
    int m6;
    long m21;
    long m39;
    long m10;
    java.io.ObjectOutputStream fileStrm;
    java.io.ObjectOutputStream helloWorldOut;
    java.io.ObjectOutputStream testStrm;
    int[] m40 = {3, -3, -1, 0, -2};
    int[] m33 = {1, -3, -2, 2, -1};
    int[] m43 = {1, 1, 2, 2};
    static java.util.Map<java.net.URI,byte[]> cache = new java.util.HashMap<>();
    static int m9;
    static int m12;
    static int m44;
    static int m2;
    static int m3;
    static java.util.List<String> m25 = new java.util.ArrayList<>();
    static java.util.List<String> m38 = new java.util.ArrayList<>();
    static java.util.List<String> m30 = new java.util.ArrayList<>();
    public C() {
        m50 = 8;
        m36 = 7;
        m8 = 1;
        m13 = 2;
        m6 = 9;
        m21 = 2L;
        m39 = 8L;
        m10 = 1L;
        try {
            fileStrm = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileStrm.txt"));
            helloWorldOut = new java.io.ObjectOutputStream(new java.io.FileOutputStream("helloWorldOut.txt"));
            testStrm = new java.io.ObjectOutputStream(new java.io.FileOutputStream("testStrm.txt"));
        } catch (java.lang.Exception e) {
            // Do nothing
        }
    }
    public void init() {
        try {
            if (fileStrm == null) fileStrm = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileStrm.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", fileStrm = " + fileStrm);
        } catch(Exception e) {
            // Ignore it
        }
        try {
            if (helloWorldOut == null) helloWorldOut = new java.io.ObjectOutputStream(new java.io.FileOutputStream("helloWorldOut.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", helloWorldOut = " + helloWorldOut);
        } catch(Exception e) {
            // Ignore it
        }
        try {
            if (testStrm == null) testStrm = new java.io.ObjectOutputStream(new java.io.FileOutputStream("testStrm.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", testStrm = " + testStrm);
        } catch(Exception e) {
            // Ignore it
        }
    }
    public byte[] getValueFromCache(String s) {
        try {
            java.net.URI url = new java.net.URI(s);
            if(!cache.containsKey(url)) {
                cache.put(url, new byte[786432]);
            }
            return cache.get(url);
        } catch (Exception e) {
            System.out.println("Error: invalid URL!");
            return null;
        }
    }
    public void m14() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(testStrm) {
                            testStrm.writeObject("метод m14 в классе C (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            testStrm.flush();
                            testStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void m15() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(testStrm) {
                            testStrm.writeObject("метод m15 в классе C (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            testStrm.flush();
                            testStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void m41() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(testStrm) {
                            testStrm.writeObject("метод m41 в классе C (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            testStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void m16() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(testStrm) {
                            testStrm.writeObject("метод m16 в классе C (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            testStrm.flush();
                            testStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void m49() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(helloWorldOut) {
                            helloWorldOut.writeObject("метод m49 в классе C (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            helloWorldOut.flush();
                            helloWorldOut.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void m5() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(helloWorldOut) {
                            helloWorldOut.writeObject("метод m5 в классе C (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            helloWorldOut.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void m17() {
        System.out.println("метод m17 в классе C");
        System.out.println(m9);
    }
    public static void m4() {
        System.out.println("метод m4 в классе C");
        System.out.println((m9 + 2));
    }
    public static void m19() {
        System.out.println("метод m19 в классе C");
        System.out.println(m12);
    }
    public static void m32() {
        System.out.println("метод m32 в классе C");
        System.out.println((m12 - 2));
    }
    public void m27(C r) {
        r.m14();
    }
    public void m27(H r) {
        r.m15();
    }
}
class H extends C {
    public H() {
        m50 = 7;
        m8 = 6;
        m21 = 2L;
        m10 = 3L;
    }
    public void m14() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(testStrm) {
                            testStrm.writeObject("метод m14 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(9);
                            testStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void m15() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileStrm) {
                            fileStrm.writeObject("метод m15 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(10);
                            fileStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void m16() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileStrm) {
                            fileStrm.writeObject("метод m16 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(10);
                            fileStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void m5() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(testStrm) {
                            testStrm.writeObject("метод m5 в классе H (#" + String.valueOf(i) + ")");
                            Thread.sleep(7);
                            testStrm.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void m46() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(13);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void m28() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(12);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void m20() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(11);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void m17() {
        System.out.println("метод m17 в классе H");
        System.out.println(m9++);
    }
    public static void m4() {
        System.out.println("метод m4 в классе H");
        System.out.println(m12);
    }
    public static void m19() {
        System.out.println("метод m19 в классе H");
        System.out.println((m12 + 1));
    }
    public static void m32() {
        System.out.println("метод m32 в классе H");
        System.out.println(m12);
    }
    public void m7() {
        for(int i = 0; i < 9; i++) {
            this.m30.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.m30.size());
        }
    }
    public void m31() {
        for(int i = 0; i < 9; i++) {
            this.m38.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.m38.size());
        }
    }
    public void m42() {
        for(int i = 0; i < 9; i++) {
            this.m38.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.m38.size());
        }
    }
    public void m22() {
        for(int i = 0; i < 7; i++) {
            this.m38.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.m38.size());
        }
    }
    public void m27(C r) {
        r.m41();
    }
    public void m27(H r) {
        r.m16();
    }
}

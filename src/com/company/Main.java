
package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        SingleLinkedList sll1 = new SingleLinkedList();
        SingleLinkedList sll2 = new SingleLinkedList();
        SingleLinkedList sll3 = new SingleLinkedList();
        String u = "";
        Random rnd = new Random();
        int count = 0;
        boolean flag = true;


        Node temp = null;
        Node temp2 = null;
        Node temp3 = null;

        while (flag == true) {
            int n = rnd.nextInt(3) + 1;
            int s = rnd.nextInt(5) + 1;

            if (n == 1) {
                if (sll1.size() < 8) {
                    sll1.insert(s);

                }
            } else if (n == 2) {
                if (sll2.size() < 8) {
                    sll2.insert(s);

                }
            } else {
                if (sll3.size() < 8) {
                    sll3.insert(s);

                }
            }

            if (count % 2 == 0) {
                u = "User1:";
            } else {
                u = "User2:";
            }
            System.out.println();
            System.out.println(u);
            System.out.print("SLL1: ");
            sll1.display();
            System.out.println();
            System.out.print("SLL2: ");
            sll2.display();
            System.out.println();
            System.out.print("SLL3: ");
            sll3.display();
            System.out.println();


            temp = sll1.getHead();
            temp2 = sll2.getHead();
            temp3 = sll3.getHead();


            //aşağı yukarı yönü
            if (sll1.size() != 0 && sll2.size() != 0 && sll3.size() != 0) {
                while (temp != null && temp2 != null && temp3 != null) {
                    if (((Integer) (temp.getData()) + 1 == (Integer) (temp2.getData()) && (Integer) (temp.getData()) + 2 == (Integer) (temp3.getData())) ||
                            ((Integer) (temp.getData()) - 1 == (Integer) (temp2.getData()) && (Integer) (temp.getData()) - 2 == (Integer) (temp3.getData()))) {
                        if (count % 2 == 0) {
                            System.out.println("Winner User1");
                        } else {
                            System.out.println("Winner User2");
                        }
                        flag = false;
                        break;
                    }
                    temp = (temp.getLink());
                    temp2 = (temp2.getLink());
                    temp3 = (temp3.getLink());
                }
            }

            //sll1 sol sağ kontrol

            if (sll1.size() > 2) {
                temp = sll1.getHead();
                while (temp != null && temp.getLink() != null && temp.getLink().getLink() != null) {
                    if (((Integer) (temp.getData()) + 1 == (Integer) (temp.getLink().getData()) && (Integer) (temp.getData()) + 2 == (Integer) (temp.getLink().getLink().getData())) ||
                            ((Integer) (temp.getData()) - 1 == (Integer) (temp.getLink().getData()) && (Integer) (temp.getData()) - 2 == (Integer) (temp.getLink().getLink().getData()))) {
                        if (count % 2 == 0) {
                            System.out.println("Winner User1");
                        } else {
                            System.out.println("Winner User2");
                        }
                        flag = false;
                        break;
                    }
                    temp = (temp.getLink());
                }
            }

            //sll2 sol sağ
            if (sll2.size() > 2) {
                temp = sll2.getHead();
                while (temp != null && temp.getLink() != null && temp.getLink().getLink() != null) {
                    if (((Integer) (temp.getData()) + 1 == (Integer) (temp.getLink().getData()) && (Integer) (temp.getData()) + 2 == (Integer) (temp.getLink().getLink().getData())) ||
                            ((Integer) (temp.getData()) - 1 == (Integer) (temp.getLink().getData()) && (Integer) (temp.getData()) - 2 == (Integer) (temp.getLink().getLink().getData()))) {
                        if (count % 2 == 0) {
                            System.out.println("Winner User1");
                        } else {
                            System.out.println("Winner User2");
                        }
                        flag = false;
                        break;
                    }
                    temp = (temp.getLink());
                }
            }
            //sll3 sağ sol
            if (sll3.size() > 2) {
                temp = sll3.getHead();
                while (temp != null && temp.getLink() != null && temp.getLink().getLink() != null) {
                    if (((Integer) (temp.getData()) + 1 == (Integer) (temp.getLink().getData()) && (Integer) (temp.getData()) + 2 == (Integer) (temp.getLink().getLink().getData())) ||
                            ((Integer) (temp.getData()) - 1 == (Integer) (temp.getLink().getData()) && (Integer) (temp.getData()) - 2 == (Integer) (temp.getLink().getLink().getData()))) {
                        if (count % 2 == 0) {
                            System.out.println("Winner User1");
                        } else {
                            System.out.println("Winner User2");
                        }
                        flag = false;
                        break;
                    }
                    temp = (temp.getLink());
                }
            }

            //sol çarpraz
            if (sll1.size() > 0 && sll2.size() > 1 && sll3.size() > 2) {
                temp = sll1.getHead();
                temp2 = sll2.getHead().getLink();
                temp3 = sll3.getHead().getLink().getLink();
                while (temp != null && temp2 != null && temp3 != null) {
                    if (((Integer) (temp.getData()) + 1 == (Integer) (temp2.getData()) && (Integer) (temp.getData()) + 2 == (Integer) temp3.getData()) ||
                            ((Integer) (temp.getData()) - 1 == (Integer) (temp2.getData()) && (Integer) (temp.getData()) - 2 == (Integer) temp3.getData())) {
                        if (count % 2 == 0) {
                            System.out.println("Winner User1");
                        } else {
                            System.out.println("Winner User2");
                        }
                        flag = false;
                        break;
                    }
                    temp = (temp.getLink());
                    temp2 = (temp2.getLink());
                    temp3 = (temp3.getLink());
                }
            }
            //sağ çarpraz
            if (sll3.size() > 0 && sll2.size() > 1 && sll1.size() > 2) {
                temp = sll3.getHead();
                temp2 = sll2.getHead().getLink();
                temp3 = sll1.getHead().getLink().getLink();
                while (temp != null && temp2 != null && temp3 != null) {
                    if (((Integer) (temp.getData()) + 1 == (Integer) (temp2.getData()) && (Integer) (temp.getData()) + 2 == (Integer) temp3.getData()) ||
                            ((Integer) (temp.getData()) - 1 == (Integer) (temp2.getData()) && (Integer) (temp.getData()) - 2 == (Integer) temp3.getData())) {
                        if (count % 2 == 0) {
                            System.out.println("Winner User1");
                        } else {
                            System.out.println("Winner User2");
                        }
                        flag = false;
                        break;
                    }
                    temp = (temp.getLink());
                    temp2 = (temp2.getLink());
                    temp3 = (temp3.getLink());
                }
            }

            //berabere
            if (sll1.size() == 8 && sll2.size() == 8 && sll3.size() == 8) {
                System.out.println("Tie");
                flag = false;
                break;
            }

            count++;
        }


    }
}

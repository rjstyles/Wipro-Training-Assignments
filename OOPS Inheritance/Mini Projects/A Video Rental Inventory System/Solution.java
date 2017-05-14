import java.util.Scanner;

class Video {
    private String title;
    private boolean checked;
    private boolean returned;
    int count;
    private double rating;

    Video(String name) {
        count = 1;
        checked = false;
        returned = true;
        rating = 5;
        title = name;
    }

    void setChecked(boolean status) {
        checked = status;
    }

    void setReturned(boolean status) {
        returned = status;
    }

    boolean isChecked() {
        return checked;
    }

    boolean isReturned() {
        return returned;
    }

    void rateVideo(double user_rating) {
        count++;
        rating = (rating + user_rating)/count;
    }

    String getTitle() {
        return title;
    }

    double getRating() {
        return rating;
    }
}

class VideoStore {
    private Video[] videos;
    private int c;
    boolean isOpen;

    VideoStore(int n) {
        videos = new Video[n];
        c = 0;
        isOpen = true;
    }

    void setIsOpen(boolean open) {
        isOpen = open;
    }

    void addVideo(String title) {
        videos[c] = new Video(title);
        c++;
    }

    boolean checkOut(String title) {
        for (int i = 0; i < c; i++) {
            if (videos[i].getTitle().equals(title)) {
                if (!videos[i].isChecked()) {
                    videos[i].setChecked(true);
                    videos[i].setReturned(false);
                    return true;
                }
            }
        }
        return false;
    }

    void returnVideo(String title) {
        for (int i = 0; i < c; i++) {
            if (videos[i].getTitle().equals(title)) {
                videos[i].setChecked(false);
                videos[i].setReturned(true);
                break;
            }
        }
    }

    void receiveRating(String title, double usr_rating) {
        for (int i = 0; i < c; i++) {
            if (videos[i].getTitle().equals(title)) {
                videos[i].rateVideo(usr_rating);
                break;
            }
        }
    }

    void listInventory() {
        System.out.printf("%10s     %s     %s\n", "Title", "Rating", "Rented");
        for (int i = 0; i < c; i++) {
            System.out.printf("%10s     ", videos[i].getTitle());
            System.out.printf("%6.1f     ", videos[i].getRating());
            if (videos[i].isChecked())
                System.out.printf("%6s     ", "Yes");
            else
                System.out.printf("%6s     ", "No");
        }
        System.out.println("\n");
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        VideoStore store = new VideoStore(10); // stroe with space for 10 videos. 
        do {
            System.out.println("Enter choice: ");
            System.out.println(
                    "1. Add Video\n2. Rent Video\n3. Rate Video\n4. Return Video\n5. Show Inventory\n6. Close Store");
            int ch = Integer.parseInt(in.nextLine());

            switch (ch) {
            case 1:
                System.out.print("Enter video title: ");
                String title = in.nextLine();
                store.addVideo(title);
                break;
            case 2:
                System.out.print("Enter video title to rent: ");
                title = in.nextLine();
                if(!store.checkOut(title))
                    System.out.println("Video already rented!");
                break;
            case 3:
                System.out.print("Enter video title to rate: ");
                title = in.nextLine();
                System.out.print("Enter rating(out of 5): ");
                double rating = Double.parseDouble(in.nextLine());
                store.receiveRating(title, rating);
                break;
            case 4:
                System.out.print("Enter video title to return: ");
                title = in.nextLine();
                store.returnVideo(title);
                break;
            case 5:
                store.listInventory();
                break;
            case 6:
                store.setIsOpen(false);
                break;
            default:
                System.out.print("Enter valid choice!!");
            }

        } while (store.isOpen);
    }
}

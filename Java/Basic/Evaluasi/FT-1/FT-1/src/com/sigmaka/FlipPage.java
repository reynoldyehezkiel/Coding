package com.sigmaka;

public class FlipPage {

    public static void main(String[] args) {
        int numOfPages = 5;
        int pageNumber = 4;

        System.out.println(flipPage(numOfPages,pageNumber));
    }

    private static int flipPage(int n, int p){
        // halaman awal kiri dan kanan jika dibuka dari depan
        int frontLeftPage = 0, frontRightPage = 1;

        // halaman awal kiri dan kanan jika dibuka dari belakang
        int backLeftPage = n-1, backRightPage = n;

        int flipCountFront = 0, flipCountBack = 0;
        int minFlipCount;
        int flipLimit = n / 2;

        // menghitung halaman yang dibuka dari depan buku
        for (int i = 0; i < flipLimit; i++){

            if (frontRightPage == p || frontLeftPage == p){
                break;
            }

            frontLeftPage += 2;
            frontRightPage += 2;

            flipCountFront++;
        }

        // menghitung halaman yang dibuka dari belakang buku
        for (int i = 0; i < flipLimit; i++){

            if (backRightPage == p || backLeftPage == p){
                break;
            }

            backLeftPage -= 2;
            backRightPage -= 2;

            flipCountBack++;
        }

        // membandingkan jumlah paling sedikit halaman yang dibuka antara depan dan belakang
        minFlipCount = Math.min(flipCountFront, flipCountBack);

        return minFlipCount;
    }
}

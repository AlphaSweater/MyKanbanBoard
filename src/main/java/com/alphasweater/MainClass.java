package com.alphasweater;
/* Author: Chad Fairlie
*  Pseudonym: AlphaSweater
*  Student Number: ST10269509
---------------------------------------------------------------------------------------------------------------------*/

import com.alphasweater.MyGUI.LoginPage;
import com.alphasweater.MyGUI.MyLoginWorkerClass;

public class MainClass {
    public static void main(String[] args) {
        MyLoginWorkerClass loginWorker = new MyLoginWorkerClass();
        loginWorker.createLoginPage();
    }
}
//--------------------------------------------------------------------------------------------------------------------//
//--------------------------------------------------------EOF---------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⣀⣴⣾⣟⡛⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀
//⠀⠀⣀⣠⣀⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀   ⠀⠀⢀⣤⡾⢟⣽⠾⠛⢱⢸⣷⠀⠀⠀⠀⠀⠀⠀⠀
//⠀⣼⠏⡉⢉⠉⠛⠻⠷⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⠀⣀⣴⠟⣋⣴⠟⠁⠀ ⡀⠻⣘⣿⠀⠀⠀⠀⠀⠀⠀⠀
//⢠⣿⠐⣴⡿⠶⣧⣆⣐⠈⡙⠿⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣀⣀⣀⡀⣀⣤⡾⠛⣁⣶⠻⠅⡒⠂⠄⠀ ⣰⠋⣿⡄⠀⠀⠀⠀⠀⠀⠀
//⢸⣿⢠⣿⠆⡀⠀⠉⠻⢷⣤⡂⠌⡙⠿⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⣾⠛⠉⠈⠉⠉⠉⠙⢻⠻⢶⣽⣋⠀⠀⠈⠀⢄⠀⠀ ⠀⠧⣿⡇⠀⠀⠀⠀⠀⠀⠀
//⠀⣿⠀⣿⡆⢀⠁⠄⠀⠀⠉⠻⢶⣄⠒⡈⠙⠻⠿⢶⣦⣤⣤⣤⣤⠶⡶⠟⠟⠛⣉⠕⠁⠀⠀⠀⠀⠀⠀⠀⠈⠁⠒⠤⡉⠛⠾⢤⣤⣈⠀⠀⠀⢧⢹⣇⠀⠀⠀⠀⠀⠀⠀
//⠀⢿⡇⢹⡂⠠⠈⠀⠀⠀⠀⠀⠀⠙⠷⣦⣁⠂⠔⠠⠐⣀⠂⡐⡀⢂⡐⡬⠔⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠪⠔⠤⢌⣙⠳⣦⣄ ⢈⢾⣿⠀⠀⠀⠀⠀⠀⠀
//⠀⢸⣷⢸⠄⠁⠠⠁⢂⠡⠄⠈⠉⠉⠖⠻⠿⣶⡈⠡⠌⡀⠆⠡⡰⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠈⠃⠰⠛⠿⠞⣿⠀⠀⠀⠀⠀⠀⠀
//⠀⠀⣿⡄⢟⠀⠠⠀⠘⠄⡀⠀⠀⡀⠀⠀⢠⡿⠃⠤⢀⠃⡘⡜⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣧⣄  ⠀⠘⠧⣿⡇⠀⠀⠀⠀⠀⠀
//⠀⠀⠹⣷⠈⠀⠁⠀⠀⠀⠀⠀⡠⠁⠀⢠⠿⠁⠌⡐⢂⠡⣌⠀⠀⠀⠀⣠⣴⣶⣶⣶⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣏⣘⣿⣿⣿⡄⠀ ⠀⠹⣷⡄⠀⠀⠀⠀⠀
//⠀⠀⠀⢻⣷⢬⠀⠀⠀⢀⠂⠌⠀⠀⢀⣾⠃⠌⡐⠰⢀⢲⡄⠀⠀⢠⣿⣿⣿⣿⣄⣨⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣿⣿⠟⠀⠀⠀ ⠈⢹⢿⣦⠀⠀⠀⠀
//⠀⠀⠀⠀⢿⣆⢣⠀⠀⠠⠐⠀⡀⠄⣾⠃⠰⣀⠡⠒⡈⠄⡄⠀⠀⠈⠛⠛⠿⠿⠿⠿⠿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⠀⠀⠀⠀ ⠀⢶⡌⣻⣷⡄⠀⠀
//⠀⠀⠀⠀⠈⢿⣎⣄⠀⠀⠀⠀⠁⢸⡟⢈⠡⠄⣂⠡⡐⢈⠘⡐⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣔⣦⡴⠴⠾⢟⣲⠀⠀⠀⠀⠀⠀  ⠀⠀⠙⢴⣹⣿⡄⠀
//⠀⠀⠀⠀⠀⠈⢿⣎⢲⠀⠀⠀⠀⣾⠇⡌⢒⡈⢄⠒⢠⠃⡰⢀⢆⡆⠠⠀⠒⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠯⢶⡄⠀⢢⣟⠃⠀⠀⠀⠀⠀ ⠀⠃⠐⢀⠑⣞⣿⡄
//⠀⠀⠀⠀⠀⠀⠈⢿⣎⢇⠀⠀⠀⡿⡐⢌⠢⡘⢄⢊⣴⢮⠳⠙⡸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠇⢀⣘⠇⠀⠀⠀⡀⢀⠀⠀⠀⠀⠀⠂⠄⠈⢿⡇
//⠀⠀⠀⠀⠀⠀⠀⠈⣿⡎⠳⢖⡚⢥⡘⠤⢃⡜⢠⠊⡍⢄⠢⣡⠇⠂⠁⠀⠀⢀⠤⠂⠀⠀⠀⠀⠀⣤⡄⡀⣀⢠⣤⢰⡦⠟⠙⠚⠒⠒⠛⠛⠉⠀ ⠀⠀⠈⢸⡇
//⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡑⢎⡜⡰⢌⢣⠣⡜⢢⢍⣴⡞⠟⡻⠀⠀⢠⠂⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣺⠁
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣏⠖⡼⣡⠏⡶⣙⢬⣳⡞⢎⡜⣡⣧⠴⠁⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡟⠀
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣎⠵⣣⢝⡲⣍⠿⣣⠝⡮⣜⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠇⠀
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣧⣛⠴⣋⢶⡩⢞⡥⣛⠴⣣⠗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢤⡿⠀⠀
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⣏⡞⡭⣖⡹⢎⠶⣍⡳⡭⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡪⢢⡿⠁⠀⠀
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⢴⢣⡝⣎⢻⣔⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠠⠀⠒⠉⢀⣿⠃⠀⠀⠀
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡿⠙⠶⠹⠬⠓⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠃⠀⠀⠀⠀
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡏⠀⠀⠀⠀⠀
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠁⠀⠀⠀⠀⠀
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀
//⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀
//⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀
//⠀⠀⠀⠀⠀⠀⠀⢀⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡄⠀⠀⠀⠀⠀
//⠀⠀⠀⠀⠀⠀⢠⡾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣇⠀⠀⠀⠀⠀
//⠀⠀⠀⠀⠀⢠⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡄⠀⠀⠀⠀
//⠀⠀⠀⠀⢠⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⡀⠀⠀⠀
//⠀⠀⠀⢀⡾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣷⡀⠀⠀⠀
//--------------------------------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
//--------------------------------------------------------------------------------------------------------------------//
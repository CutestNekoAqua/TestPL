#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "QFileDialog"
#include "QMessageBox"
#include "QDesktopServices"
#include "QUrl"
#include "string"
#include "QCoreApplication"

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_pushButton_clicked()
{
    QDesktopServices::openUrl(QUrl("file:///" + QCoreApplication::applicationDirPath() + "/executeables/kegcoind.exe"));
}

void MainWindow::on_pushButton_4_clicked()
{
    QDesktopServices::openUrl(QUrl("file:///" + QCoreApplication::applicationDirPath() + "/executeables/wallet-api.exe"));
}

void MainWindow::on_pushButton_5_clicked()
{
    QDesktopServices::openUrl(QUrl("file:///" + QCoreApplication::applicationDirPath() + "/executeables/kegcoin-service.exe"));
}

void MainWindow::on_pushButton_6_clicked()
{
    QDesktopServices::openUrl(QUrl("file:///" + QCoreApplication::applicationDirPath() + "/executeables/kegwallet-beta.exe"));
}

void MainWindow::on_pushButton_7_clicked()
{
    QDesktopServices::openUrl(QUrl("file:///" + QCoreApplication::applicationDirPath() + "/executeables/cryptotest.exe"));
}

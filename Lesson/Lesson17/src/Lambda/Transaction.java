package Lambda;

import java.time.LocalDate;

public class Transaction {
    LocalDate date;
    String content;
    String account;
    long money;

    public Transaction(LocalDate date, String content, String account, long money) {
        this.date = date;
        this.content = content;
        this.account = account;
        this.money = money;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Ngày: " + date + " - " + "Nội dung: " + content + " - " + "Tài khoản thụ hưởng: " + account + " - " + "Số tiền: " + money;
    }
}

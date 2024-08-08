# BDD
BDD experiment for Software Enginnering Lab Course @ SUT.

اعضای تیم:
- همراز عرفاتی ۹۹۱۰۹۷۹۹
- امیرحسین براتی ۹۹۱۰۱۳۰۸
- امیرحسین عابدی ۹۹۱۰۵۵۹۴

## BBD in Intellij

 
## انجام مراحل کد:

با استفاده از دستورالعمل داده شده در فایل example.pdf در ابتدا dependency های لازم برای اجرای تست‌های behavioural را نصب می‌کنیم و در ادامه یک نمونه از BDD را نوشته و اجرا می‌کنیم. این تست‌ها در فایل .feature نوشته و اجرا می‌شوند. بعد از انجام مراحل گفته شده می‌توانیم با موفقیت تست را از طریق cucumber اجرا کنیم

![telegram-cloud-photo-size-4-5884249554122031515-y](https://github.com/user-attachments/assets/2ea0b7e5-33f1-4989-afaf-b380011b1f7b)


همینطور برای اینکه این تست‌ها بتوانند از طریق JUnit هم اجرا بشوند یک کلاس Runner اضافه می‌کنیم که انوتیشن‌های Cucumber را دارد و تست‌های Behavioural را اجرا می‌کند.

![telegram-cloud-photo-size-4-5884249554122031516-y](https://github.com/user-attachments/assets/1746618d-6090-4cb9-ab2b-92bdaf8b1363)


## تغییر در کد
بعد از اینکه Scenario را به Scenario Outline تغییر می‌دهیم مشاهده می‌کنیم که تست دوم Undefined می‌شود و اجرا نمی‌شود. خطایی که در این تست رخ می‌دهد این است که با توجه به رجکسی که برای تایع Given نوشته‌ایم متن تست دوم درون این رجکس صدق نمی‌کند و باید رجکس آن را برای عددهای منفی گسترش دهیم

![telegram-cloud-photo-size-4-5884249554122031520-y](https://github.com/user-attachments/assets/92dc3d2a-7c9a-4012-afdc-41c7638381d2)


بعد از تغییر رجکس در تابع Given می‌بینیم که این تست هم به درستی اجرا می‌شود و این برنامه به درستی کار می‌کند.

![telegram-cloud-photo-size-4-5884249554122031521-y](https://github.com/user-attachments/assets/531ee6d8-b11d-44a5-a212-5ce814fcf423)



## مسئله جدید

در ابتدا کلاس Calculator را گسترش می‌دهیم به طوری که انواع عملیات‌ها را انجام دهد. این کلاس در نهایت از تمامی عملیات‌ها پشتیبانی می‌کند.

<img width="731" alt="image" src="https://github.com/user-attachments/assets/0e0b6f78-1e95-4e3a-9e4e-52f1842a74bf">

حال تست‌های بخش جذر و تست‌هایی برای بقیه قسمت‌های ماشین حساب اضافه می‌کنیم.

<img width="677" alt="image" src="https://github.com/user-attachments/assets/7f6389de-6f80-4a5b-94ab-51164b9a13ff">
<img width="825" alt="image" src="https://github.com/user-attachments/assets/5d0e55c4-d5f4-4ad5-99b0-c9a29b453a4d">

حال که انواع مختلفی از تست‌ها را اضافه کردیم می‌ةوانیم همه‌ی آن ها را باهم ران کنیم و نحوه عملکرد کد را بسنجیم.

<img width="1470" alt="image" src="https://github.com/user-attachments/assets/d0561631-6945-4274-a15b-a2e0eaf2cc03">

در نهایت مشاهده می‌کنیم که تمامی تست‌ها به درستی ران و پاس می‌شوند.


# Car_Automatisation
Car Renting Automatisation
Bu projede araç kiralama otomasyon sistemi hazırlanmıştır. Bu otomasyon sisteminde SQL ile veri işlemleri ile yapılmıştır. Ana amaç gerçeğe en yakın tarzda araba kiralama sistemi yapmaktır. Kiralama otomasyonun genel yaptıkları giriş yapıldıktan sonra müşterinin kendi arabasını ekleme, kiralanabilecek arabaları görebilme, kiralanmış arabaları görme özelliği vardır başlıca.
Kiralanmış ve geri gelmiş arabaların listesini “yazdır” tuşu ile pdf’e  dönüştürebilir. Aynı zamanda belirlenen tarihten sonra yani arabayı geri dönüş tarihi gecikti ise ceza parası yansıtılıyor. Tabii ki de geri dönmüş arabalar kiralanmış arabalardan siliniyor. Ve böylece döngü işliyor. Kiralanmış arabadan müsait araba statüsüne geçiyor ve yeni gelen müşteriler bunu görebiliyor.
Yanda bulunan panelde yazılan yazılara komutlar verilmiştir istediğiniz sayfaya oradan geçebilirsiniz!!!!!
Toplamda 4 adet veri tablosu vardır.
Arabalar Tablosu: Arabanın üye numarası, markası, modeli, müsaitlik durumu ve kiralanma fiyatı vardır. Bu tablo ile yeni araba eklenebilir, silinebilir, düzenlenebilir.
Müşteri Tablosu: Müşterinin kimlik numarası ,müşterinin ismi, müşterinin adresi, müşterinin telefonu
Yine aynı şekilde bu tabloda da müşteri kayıt, müşteri silme  ve bilgi düzenlenme işleri yapabilir.
Kiralanan Arabalar Tablosu: Kiralanma ID’si ,araba üye numarası, müşteri ismi ,kiralanma tarihi, geri verilme tarihi ve ücreti gözükür. Bu tablonun bilgi ekleme, bilgi düzenleme özellikleri vardır ve 2 tane tablo olup 1 tanesi sadece kiralanabilir araçları gösterir. Diğeri ise halihazırda kiralanmış arabalar gösterir.
Geri Gelmiş Araçlar Tablosu:  Geri dönüş ID’si, araba üye numarası , müşteri ismi, geri verilme tarihi
Gecikme tarihi ve ceza parası verileri vardır. Bu bilgileri kontrol edecek panel bulunmaktadır.

**********!!!!!!!!Giriş Ekranı: Kullanıcı Adı: Suleyman    ,    Şifre:123!!!!!!!!************
Eklenen Kütüphaneler:
mysql-connector-j-8.4.0.jar
rs2xml.jar
jcalendar-1.4.jar
	 
!!!!**in english**!!!
In this project, a car rental automation system was prepared. In this automation system, data operations were done with SQL. The main purpose is to make a car rental system in the closest style to reality. The main features of the rental automation are the ability to add the customer's own car, to see the cars that can be rented, to see the rented cars after logging in.
The list of rented and returned cars can be converted to pdf with the "print" button. At the same time, after the set date, that is, if the return date of the car is delayed, a penalty fee is reflected. Of course, the returned cars are deleted from the rented cars. And so the cycle works. It goes from rented car to available car status and new customers can see this.
Commands are given to the articles written in the panel on the side, you can go to the page you want from there!!!!!
There are 4 data tables in total.
Cars Table: This table contains the car's member number, make, model, availability and rental price. New cars can be added, deleted and edited with this table.
Customer Table: Customer's ID number, customer's name, customer's address, customer's phone number
In the same way, customer registration, customer deletion and information editing can be done in this table.
Rented Cars Table: Rental ID, car member number, customer name, rental date, return date and fee are displayed. This table has the features of adding information, editing information and there are 2 tables, 1 of which shows only the vehicles that can be rented. The other one shows the cars that are already rented.
Returned Cars Table:  Return ID, car member number, customer name, return date
There is data on the overdue date and penalty fee. There is a panel to control this information.

Login Screen: Username: Suleyman, Password:123
Added Libraries:
mysql-connector-j-8.4.0.jar
rs2xml.jar
jcalendar-1.4.jar

Translated with DeepL.com (free version)


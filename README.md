# JWT AUTHENTICATION
Authentication &amp; Authorization with JWT token

### Proje Kurulumu

Projeyi öncelikle forklayın ve clone edin.
Daha sonra projeyi IntellijIDEA kullanarak açınız. README.md dosyasını dikkatli bir şekilde okuyarak istenenleri yapmaya çalışın.
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

 ### Başlangıç
 * Spring Initializr kullanarak bir Spring Boot projesi oluşturun.
 * İçerisinde ```Spring Web```,  ```Spring Security``` dependency eklenmeli.
 * Maven dependency management sistemini kullanarak tüm dependencyleri install edin.
 * Uygulamanızı  ```9000``` portundan ayağa kaldırın.
 * JWT token kullanımını tanımak üzerine bir api yazmalıyız.

### Amaç
 * Amacımız JWT token kullanarak user role ilişkisi işe ulaşabileceğimiz rest apiler tanımlamak.
 * JWT token oluşturan ve validasyonu yapan kodu siz hazırlamalısınız.
 * JWT token ile role tabanlı authentication ve authorization işlemlerin nasıl yapıldığını anlamalıyız.
 
 ### Görev 1
 * main metodunuzun olduğu paket altında ```config```, ```controller```, ```entity```, ```dao```, ```service``` isminde 5 adet daha paket oluşturunuz.
 * Project Lombok'u dependency olarak uygulamanıza ekleyin.
 * ```entity``` paketinin altına ```Member``` adında bir sınıf tanımlayınız. İçerisinde instance variable olarak ```id, firstName, lastName, email, password``` isminde 5 tane değişken oluşturun.
 * ```entity``` paketinin altına JDBCAuthentication için ```Role``` adında bir sınıf oluşturunuz içerisine ```id, authority``` adında 2 field ekleyiniz. Member ve Role arasında many-to-many bir ilişki tanımlamalısınız.
 * ```Role``` ```USER ve ADMIN``` değerlerini alır.
 * ```Student``` isminde bir sınıf yazınız. ```id, tckn, firstName, lastName``` değerleri olmalı.
 * Lombok ve JPA annotation larını uygulayarak bütün sınıfı bir veritabanı tablosu olucak şekilde işaretleyiniz.
 * ```application.properties``` dosyanızı kullanarak veritabanı bağlantınızı kurun.
 * Spring uygulamasının veritabanı loglarını açarak veritabanına yolladığınız her sorguyu inceleyin.

### Görev 2
 * Service ve Dao paketi katmanlarını yazmalısınız. 
 * Student objesi MVC kurallarına uygun olarak veritabanı işlemlerini yapabilmeli.
 * CRUD işlemlerini Service katmanı karşılayabilmeli

 ### Görev 3
 * ```controller``` paketi altında ```StudentController``` adında 1 tane controller yazmalısınız.
 * StudentService sınıfını StudentController sınıfı altında ```Dependency Injection``` yöntemini kullanarak çağırınız.
 * Amacımız CRUD işlemlerini tanımlayan endpointler yazmak.
 * [GET]/workintech/students/ => tüm burger listini dönmeli.
 * [GET]/workintech/students/{id} => İlgili id deki burger objesini dönmeli.
 * [POST]/workintech/students => Bir adet burger objesini veritabanına kaydeder.
 * [PUT]/workintech/students/{id} => İlgili id deki burger objesinin değerlerini yeni gelen data ile değiştirir.
 * [DELETE]/workintech/students/{id} => İlgili id değerindeki burger objesini veritabanından siler.
 * role değeri USER olan kullanıcılar sadece [GET] requesti atabilirler.
 * role değeri ADMIN olan kullanıcılar [GET][POST][PUT][DELETE] requestlerinin tamamını atabilirler.

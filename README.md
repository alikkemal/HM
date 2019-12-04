Serenity Framework - UI Test
(PageObjectModel) 

Test İçin Şu İhtiyaçlar Karşılanmalıdır;

JDK 1.8 ve Maven kurulmalıdır.
Proje git clone üzerinden çekilerek
Terminal üzerinde mvn clean verify komutu ile kontrol edilmelidir.

** Test'i Run ettiğinizde chrome versiyon kaynaklı sorun yaşarsanız /src/test/java/tests/CampaignTest class'ın içinde driver alanı aşağıdaki şekilde 
eklenmeli,

     @Managed(driver = "chrome")
     WebDriver driver;
	
 * Şu dizinde /src/test/resources/serenity.conf bulunan serenity.conf dosyası aşağıdaki şekilde güncellenmelidir.	

   webdriver {
            driver = chrome
             }

Testleri Zalenium Docker üzerinden koşmak için Terminal üzerinde aşağıdaki adımlar yapılmalıdır;

Local Docker Container

Selenium Docker Image Pull   
 -> docker pull elgalu/selenium  
 
Zalenium Docker Image Pull
 -> docker pull dosel/zalenium       
  
    //yükleme yapıldıktan sonra aşağıdaki komutlar tek seferde enter edilmelidir

Start Zalenium Grid

  docker run --rm -ti --name zalenium -p 4444:4444 
  -v /var/run/docker.sock:/var/run/docker.sock 
  -v /tmp/videos:/home/seluser/videos 
  --privileged dosel/zalenium start
  
  İşlem tamamlandığında yine terminal üzerinde şu komutların sonucu kontrol edilmelidir.
        Docker images // Kurulu images leri getirir
		Docker ps -a // Kurulu konteynırları getirir
		Docker rm -f // Adını verdiğiniz konteynırları kill eder.
		
	Not: Yetkilendirme kaynaklı sorun yaşadığınızda terminal üzerinde " Docker system prune " komutu ile mevcut konteynırların tümünü silebilirsiniz. Bir önceki Docker setup adımları baştan uygulanarak işlem yapıldığında kaldığınız yerden devam edebilirsiniz.
  
  Bu işlemden sonra Docker ps -a komutundan PORT adresi alanında yazan 4444 kodu lochalhost üzerinden remote url olarak verilir ve 
  /src/test/resources/serenity.conf alanında aşağıdaki şekilde ekleme yapılır ve testlerinizi browser üzerinde local adresinizden örn: http://localhost:4444/dashboard/ izleyebilirsiniz.
  
  webdriver {
  driver = remote
  remote {
      url="http://localhost:4444/wd/hub"
      driver=chrome
         }
      }

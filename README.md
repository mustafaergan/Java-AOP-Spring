# Spring AOP Örneği

Spring AOP ve AspectJ anotasyonlarıyla bir servisin metotlarının öncesine ve sonrasına araya giren kod
(aspect) yazmayı gösteren küçük örnek. Yapılandırma XML ile yapılır.

> **Not:** Bu depo 2017 yılında eğitim amaçlı yazıldı ve artık güncellenmiyor. Bağımlılıkları eskidir ve
> bilinen güvenlik açıkları içerir; üretimde kullanmayın.

## İçerik

Proje `aop-spring` klasöründedir.

- `MyService` — `hello()`, `sum()`, `sumList()` ve `sumObject()` metotları olan basit servis.
- `MyAspect` — `@Before`, `@After`, `@AfterReturning` (dönen değeri yakalama) ve `@AfterThrowing`
  tavsiyelerini `execution(...)` ifadeleriyle servisin metotlarına bağlar.
- `src/main/resources/Spring-Conf.xml` — `<aop:aspectj-autoproxy/>` ile aspect'i etkinleştirir, servis ve aspect
  bean'lerini tanımlar.
- `App` — Spring bağlamını XML'den yükleyip servis metotlarını çağırır; aspect çıktıları konsola yazılır.

## Teknolojiler

- Java, Maven
- Spring Framework 4.0.6 (core, context, aop)
- AspectJ 1.8.10 (`aspectjrt`, `aspectjweaver`)
- JUnit 3.8.1

## Çalıştırma

`pom.xml`'de Java sürümü belirtilmemiştir; kod Java 7 ve üstü sözdizimi kullanır.

```bash
cd aop-spring
mvn compile exec:java -Dexec.mainClass=com.mustafaergan.aop.App
```

Ya da projeyi Eclipse/IntelliJ IDEA'ya Maven projesi olarak alıp `App` sınıfını çalıştırın.

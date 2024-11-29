# Build aşaması
FROM gradle:8.11.1-jdk17 AS build

WORKDIR /app

# Proje dosyalarını kopyalayın
COPY . .

# Gradle ile bağımlılıkları yükle ve uygulamayı build et
RUN gradle clean build -x test

# Run aşaması
FROM openjdk:17-jdk-slim

# Build aşamasında oluşturulan jar dosyasını kopyala
COPY --from=build /app/build/libs/*.jar app.jar

# Çalıştırma komutunu ayarla
ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080

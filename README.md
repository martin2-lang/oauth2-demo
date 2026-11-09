# oauth2-demo

Aplicación Spring Boot que autentica usuarios con Google mediante OAuth 2.0 / OpenID Connect y protege la ruta `/perfil`.

## Requisitos
- JDK 21 o superior (`java -version`)
- VS Code con *Extension Pack for Java* y *Spring Boot Extension Pack*
- Cuenta de Google registrada como usuario de prueba en Google Cloud

## Configuración
1. En Google Cloud crear un cliente OAuth de tipo *Web application* con la redirect URI exacta:
   `http://localhost:8080/login/oauth2/code/google`
2. Abrir el archivo `.env` y reemplazar los valores:
   ```
   GOOGLE_CLIENT_ID=...
   GOOGLE_CLIENT_SECRET=...
   ```
   El archivo `.env` está en `.gitignore`; no se sube al repositorio.

## Ejecución
- **VS Code:** abrir la carpeta, esperar a que cargue el proyecto Java y pulsar *Run* (F5) en `Oauth2DemoApplication`.
- **Terminal (PowerShell):**
  ```powershell
  $env:GOOGLE_CLIENT_ID="tu_client_id"
  $env:GOOGLE_CLIENT_SECRET="tu_client_secret"
  ./mvnw spring-boot:run
  ```
Abrir http://localhost:8080 y pulsar "Iniciar sesión con Google".

## Rutas
| Ruta | Acceso |
|------|--------|
| `/` | Pública |
| `/perfil` | Autenticada |

## Pruebas
Capturas P01–P06 en la carpeta `evidencias/`.

## Seguridad
No se incluyen credenciales en el repositorio.

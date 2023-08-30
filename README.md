# Documentation for Selenium WebDriver 
Selenium is a popular framework for automating web browsers, allowing developers and testers to simulate user interactions with web applications. To utilize Selenium effectively, We need to Download & install Java , Download & configure Intellij IDEA or any Java IDE and  Download the Selenium clients and WebDriver language bindings.

* Download & install Java. (**Visit the Oracle JDK Download Page**) - Go to the official Oracle JDK download page at https://www.oracle.com/java/technologies/javase-jdk16-downloads.html (or the latest version URL). Be sure to review and accept the Oracle Binary Code License Agreement for Java SE before downloading. (**Select the Version**) Choose the version of Java Development Kit (JDK) that you want to download. It's recommended to choose the latest version for the most up-to-date features and security patches. (**Choose the Operating System**)  Select your operating system (Windows, macOS, or Linux) from the available options.(**Download the Installer**) Click on the download link for your operating system. This will initiate the download of the JDK installer file. (**Run the Installer**) Once the download is complete, locate the installer file and run it by double-clicking on it. (**Follow the Installation Wizardr**) The installer will guide you through the installation process. Follow the on-screen instructions to set up Java on your computer. You might need to specify the installation directory and agree to the terms and conditions.(**Set the PATH Environment Variable For Windows**) This step is optional but recommended. To use Java from the command line, you can set the PATH environment variable to point to the Java installation directory. This allows you to run Java commands without specifying the full path. (**Verify the Installation**) After the installation is complete, open a command prompt (or terminal) and type java -version. This should display the version of Java just installed.

* Download & configure Intellij IDEA.(**Download IntelliJ IDEA**) Visit the official IntelliJ IDEA website at https://www.jetbrains.com/idea/ and click on the "Download" button. There are two versions available: the Community Edition (free) and the Ultimate Edition (paid with more features). Choose the community editor that suits our needs and click the corresponding download button. (**Run the Installer**) Once the download is complete, locate the installer file and run it by double-clicking on it.Follow the (**Installation Wizard**) The installer will guide you through the installation process. Follow the on-screen instructions to install IntelliJ IDEA on your computer. (**Configure IntelliJ IDEA**) After the installation is complete, launch IntelliJ IDEA. On the first run, you'll be prompted to configure some initial settings.(**UI Themes**) Choose your preferred theme for the IDE.(**Keymaps**) Select the keymap that you're most comfortable with. The default is usually "IntelliJ IDEA.(**Plugins**) You can choose to install additional plugins based on your needs. For Java development, the essential plugins are usually already pre-selected.(**Create a New Project**) If you're starting a new Java project, select "Create New Project" and choose the appropriate Java project type. Follow the step to set up your project.(**Import Existing Project**) If you have an existing Java project, you can select "Import Project" and choose the project's root directory. IntelliJ IDEA will try to detect the project structure and configure itself accordingly.(**Configure JDK**) If you've already installed a JDK, IntelliJ IDEA might detect it automatically. If not, you'll need to configure it manually.Go to "File" > "Project Structure" > "Project" > "Project SDK." click on "New" and select the path to your JDK installation directory.Choose the appropriate version of Java and click "OK." (**Start Coding**)Once your project is set up and the JDK is configured, you can start coding in IntelliJ IDEA. You'll find features like code completion, syntax highlighting, debugging tools, and more to help you develop Java applications efficiently.


* Download Selenium Clients and WebDriver Language Bindings. (**Download Selenium WebDriver Language Binding**) Visit the official Selenium WebDriver download page: https://www.selenium.dev/downloads/ . Choose the WebDriver language binding for Java. This is usually the "Java" binding. Download the WebDriver JAR file for Java.(**Create a New Java Project in IntelliJ IDEA**) Open IntelliJ IDEA and create a new Java project. Click on "File" > "New" > "Project..." Select "Java" on the left panel, and choose "Java" as the project SDK.
Follow the prompts to set up your project. Add WebDriver JAR to Your Project . Click "File" > "Project Structure" > "Dependencies" > "+" > "add all jars" >"apply"> "Ok". (**Configure Browser Drivers**) To use WebDriver, you'll need to configure browser drivers. For example,if you're using Chrome. Download the ChromeDriver executable ( https://googlechromelabs.github.io/chrome-for-testing/ )
Add the location of the ChromeDriver executable to your system's PATH environment variable or specify its path in your test code.
Remember that (**browser drivers should match the version of the browser**) you're using.
  
## Test Suite Composition
- Launch chrome browser and navigate to webpage.
- Capture title of the webpage, capture the url of the webpage, capture page source.
- Login to the webpage using standard user.
- Login to the webpage using Locked out user.
- Login to the webpage using problem user.
- Login to the webpage using performance-glitch user.
- Login and switch to current page using X path.
- Switch to current page and add 2 product in the cart using X path.
- List of webElements in a page [Like-anchor tag a].
- Sort products (Handling of Dropdown) by visible text.
- Sort products by value.
- Sort products by index
- Sort products by multiple options[Like-(A to Z)+Low Price].
- Find broken links/dead links on products page.
- See product details by clicking on Image links.
- Product details by clicking on Image links and add to cart.
- Scroll down the web page by Pixel.
- Scroll down the web page by visibility of the element.
- Scroll down the web page at the bottom of the page.
- Remove one item from cart
- Checkout a product
- Readable report using testNG.(For run this you need to create Maven project and configure the project)




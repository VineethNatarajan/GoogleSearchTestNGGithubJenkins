set myProjectpath=C:\workspace\WebDriverJenkinsTest\javaSelfTrainingPrograms
echo %myProjectpath%
cd %myProjectpath%
set classpath=%myProjectpath%\bin;%myProjectpath%\lib\*
java org.testng.TestNG %myProjectpath%\testng.xml 
pause
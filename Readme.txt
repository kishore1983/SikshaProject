Setup and Executions steps:
1. First of all, create a maven project.
2. Add required dependencies in pom.xml file.
3. Create packages: features, pompages, runnerFile, stepDefinition.
4. Generate files in respective packages.
5. Add Drivers like ChromeDriver.exe in 'driver' folder after creating the folder.
6. Run maven goal: clean install.
7. Execute the runner file that is under runnerFile package.

Result:
1. This script checks if application page loads without any errors.
2. This page verify all the available links by clicking and getting the status code of it.
If status code is more than 400 then it is an invalid link.
3. For correct working links, it will display "<url name> is a valid link".
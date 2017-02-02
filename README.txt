# if I want to make my JAR excecutable, I have to put it in my pom.xml
  <build>
	<plugins>
	  <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-jar-plugin</artifactId>
        <configuration>
            <archive>
                <manifest>
                    <mainClass>com.aetsmtl.java8Learning.App</mainClass>
                </manifest>
            </archive>
        </configuration>
       </plugin>
	   <!-- <plugin>
	      <artifactId>maven-assembly-plugin</artifactId>
	      <configuration>
	        <archive>
	          <manifest>
	            <mainClass>com.aetsmtl.java8Learning.App</mainClass>
	          </manifest>
	        </archive>
	        <descriptorRefs>
	          <descriptorRef>jar-with-dependencies</descriptorRef>
	        </descriptorRefs>
	      </configuration>
	    </plugin>-->
	</plugins>
  </build>

# Do not forget to use the debugger, Breakpoint, continouis, step into, step Over, ...
# See what its containned into variable
# Etc... 
# Also method hierachy; practical to follow the execution of loop and so on!

-
You cloud declared Main class in the manifest.mf to tell where is the main class in the JAR
After that you could start your application by java -jar <nameofjar.jar>

---
Client-Server architecture
two tier or three tier architechture

--- 
Static import like " import static java.lang.Math.*" make static field and variable avaible without classname.

-
Dequeu Double endend Queue pronounced DECK


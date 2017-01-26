if I want to make my JAR excecutable, I have to put it in my pom.xml
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



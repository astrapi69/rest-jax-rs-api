# Overview

This is a port of rest-api module project from the persistence-api project. It is an implementation of the stackoverflow question: <a href="https://stackoverflow.com/questions/26777083/best-practice-for-rest-token-based-authentication-with-jax-rs-and-jersey">Best practice for REST token-based authentication with JAX-RS and Jersey</a>

If you like this project put a ⭐ and donate

## Note

No animals were harmed in the making of this library.


# Donations

If you like this library, please consider a donation through bitcoin or over bitcoin-cash with:

36JxRRDfRazLNqUV6NsywCw1q7TK38ukpC

or over ether with:

0x588Aa02De98B1Ef70afeDC3ec5290130a3E5e273

or over donate buttons at the top

## License

The source code comes under the liberal MIT License, making rest-jax-rs-api great for all types of applications.

## Maven dependency

Maven dependency is now on sonatype.
Check out [sonatype repository](https://oss.sonatype.org/index.html#nexus-search;gav~de.alpharogroup~rest-jax-rs-api~~~) for latest snapshots and releases.

Add the following maven dependency to your project `pom.xml` if you want to import the core functionality of rest-jax-rs-api:

Than you can add the dependency to your dependencies:


	<properties>
			...
		<!-- REST-JAX-RS-API version -->
		<rest-jax-rs-api.version>7</rest-jax-rs-api.version>
			...
	</properties>
			...
		<dependencies>
			...
			<!-- REST-JAX-RS-API DEPENDENCY -->
			<dependency>
				<groupId>de.alpharogroup</groupId>
				<artifactId>rest-jax-rs-api</artifactId>
				<version>${rest-jax-rs-api.version}</version>
			</dependency>
			...
		</dependencies>

	
## gradle dependency

Add the following gradle dependency to your project `build.gradle` in the dependencies section if you want to import the core functionality of rest-jax-rs-api:

```
ext {
			...
    entApiVersion = "7"
			...
}
dependencies {
			...
	compile "de.alpharogroup:rest-jax-rs-api:${entApiVersion}"
			...
}
```

## Semantic Versioning

The versions of rest-jax-rs-api are maintained with the Simplified Semantic Versioning guidelines.

Release version numbers will be incremented in the following format:

`<major>.<minor>.<patch>`

For detailed information on versioning for this project you can visit this [wiki page](https://github.com/lightblueseas/mvn-parent-projects/wiki/Simplified-Semantic-Versioning).

## Want to Help and improve it? ###

The source code for rest-jax-rs-api are on GitHub. Please feel free to fork and send pull requests!

Create your own fork of [astrapi69/rest-jax-rs-api/fork](https://github.com/astrapi69/rest-jax-rs-api/fork)

To share your changes, [submit a pull request](https://github.com/astrapi69/rest-jax-rs-api/pull/new/develop).

Don't forget to add new units tests on your changes.

## Contacting the Developers

Do not hesitate to contact the rest-jax-rs-api developers with your questions, concerns, comments, bug reports, or feature requests.
- Feature requests, questions and bug reports can be reported at the [issues page](https://github.com/astrapi69/rest-jax-rs-api/issues).

## Credits

|**Travis CI**|
|     :---:      |
|[![Travis CI](https://travis-ci.com/images/logos/TravisCI-Full-Color.png)](https://coveralls.io/github/astrapi69/rest-jax-rs-api?branch=master)|
|Special thanks to [Travis CI](https://travis-ci.org) for providing a free continuous integration service for open source projects|
|     <img width=1000/>     |

|**Nexus Sonatype repositories**|
|     :---:      |
|[![sonatype repository](https://img.shields.io/nexus/r/https/oss.sonatype.org/de.alpharogroup/rest-jax-rs-api.svg?style=for-the-badge)](https://oss.sonatype.org/index.html#nexus-search;gav~de.alpharogroup~rest-jax-rs-api~~~)|
|Special thanks to [sonatype repository](https://www.sonatype.com) for providing a free maven repository service for open source projects|
|     <img width=1000/>     |

|**javadoc.io**|
|     :---:      |
|[![Javadocs](http://www.javadoc.io/badge/de.alpharogroup/rest-jax-rs-api.svg)](http://www.javadoc.io/doc/de.alpharogroup/rest-jax-rs-api)|
|Special thanks to [javadoc.io](http://www.javadoc.io) for providing a free javadoc documentation for open source projects|
|     <img width=1000/>     |

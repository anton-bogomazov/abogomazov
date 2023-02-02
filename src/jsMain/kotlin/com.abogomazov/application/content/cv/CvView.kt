package com.abogomazov.application.content.cv

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.boxSizing
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text

@Composable
fun CvView() {
    Section({
        style {
            display(DisplayStyle.Block)
        }
    }) {
        Text("Skills\n" +
                "Core: OOP and Microservice patterns, DDD principles, Testing, CI/CD, Debugging, UNIX.\n" +
                "PL: Java 17, Kotlin\n" +
                "Web: Spring (Boot, MVC/WebFlux, Cloud, Data, Security)\n" +
                "Testing: Junit, Mockito, WireMock, Testcontainers\n" +
                "Build: Gradle, Maven, Jib\n" +
                "Message Brokers: RabbitMQ, Kafka\n" +
                "DB: PostgreSQL, Hibernate, Liquibase, MongoDB\n" +
                "DevOps: Docker, Kubernetes\n" +
                "Monitoring: ELK, Grafana, Zabbix, Prometheus, APM\n" +
                "VC: Git, BitBucket, Gitlab\n" +
                "Tools: Postman, Jira, IntelliJ IDEA\n" +
                "Familiar with: HTML/CSS/JS (TS), Ktor, Exposed, Kotlin Serialization, Python + Jupiter\n" +
                "Courses and certificates\n" +
                "Java. Functional Programming\n" +
                "HackerRank SQL Basic\n" +
                "HackerRank SQL Intermediate\n" +
                "HackerRank Problem Solving Basic\n" +
                "HackerRank Problem Solving Intermediate\n" +
                "MongoDB Basics\n" +
                "Mathematics and Python for data analysis\n" +
                "Frontend Developer Learning Path\n" +
                "Languages\n" +
                "English\n" +
                "B2 Certificate\n" +
                "\n" +
                "Russian\n" +
                "Native\n" +
                "Experienced developer of RESTful microservices. I'm constantly looking for new ideas and solutions, eager to learn from the experience of colleagues and contribute to their expertise. As a business-oriented developer, I know how important to convey the advantages and disadvantages of each technical solution in terms of deadlines and business risks.\n" +
                "Experience\n" +
                "Team Lead (Kotlin Backend)\n" +
                "Beeline (VK-IT), Moscow\n" +
                "Apr 2022 - Present\n" +
                "Management of 2 teams of 3 and 6 people. Developing backend to operate services and customer personal data.\n" +
                "Responsibilities:\n" +
                "Evaluating and managing deadlines for tasks.\n" +
                "Building development processes.\n" +
                "Code review and code style control.\n" +
                "Training and adapting Java developers.\n" +
                "Kotlin Backend Developer\n" +
                "Domclick (Sberbank Real Estate Center), Moscow\n" +
                "Dec 2020 - Apr 2022\n" +
                "Developing microservices for real estate transactions including such features as data collection, sale agreement generation, secure payment service, and Rosreestr registration.\n" +
                "Responsibilities:\n" +
                "Development and testing.\n" +
                "Setting tasks, evaluating them, and performing code reviews.\n" +
                "Technical improvement of the project: implementation of new technologies and best practices.\n" +
                "Mentoring and maintaining a high development culture within the team.\n" +
                "Monitoring and providing high availability of services.\n" +
                "Achievements:\n" +
                "Untangled domain model dependencies and automated work with them, saving developers ~30 minutes a day on publishing it.\n" +
                "Changed the code style in WebFlux microservices from functional to imperative with coroutines. That made it easier to support such services.\n" +
                "Developed backend-for-frontend to make frontend development cheaper.\n" +
                "Education\n" +
                "C/C++ Developer\n" +
                "Ecole 42, Moscow\n" +
                "Apr 2022 - Present\n" +
                "Advanced study of algorithms and data structures. Development and testing principles. Implementing such projects as standard C libraries and UNIX terminal.\n" +
                "Computer Science\n" +
                "Self-study\n" +
                "Nov 2016 - Present")
    }
}

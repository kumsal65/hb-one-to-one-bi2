package com.kumsal.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="youtube_channel")
		private String youTube;
		
		@Column(name="hobby")
		private String hobby;
		
		@OneToOne(mappedBy="instructor_detail",cascade=CascadeType.ALL)
		private Instructor theInstructor;

		public InstructorDetail() {
			// TODO Auto-generated constructor stub
		}
		public InstructorDetail(String youTube, String hobby) {
			this.youTube = youTube;
			this.hobby = hobby;
		}

		public int getId() {
			return id;
		}


		public String getYouTube() {
			return youTube;
		}

		public void setYouTube(String youTube) {
			this.youTube = youTube;
		}

		public String getHobby() {
			return hobby;
		}

		public void setHobby(String hobby) {
			this.hobby = hobby;
		}
		

		public Instructor getTheInstructor() {
			return theInstructor;
		}
		public void setTheInstructor(Instructor theInstructor) {
			this.theInstructor = theInstructor;
		}
		@Override
		public String toString() {
			return "InstructorDetail [id=" + id + ", youTube=" + youTube + ", hobby=" + hobby + "]";
		}
		
}

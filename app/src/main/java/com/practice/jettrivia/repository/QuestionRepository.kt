package com.practice.jettrivia.repositoryimport com.practice.jettrivia.model.QuestionItemimport com.practice.jettrivia.network.QuestionApiimport javax.inject.Injectclass QuestionRepository @Inject constructor(    private val api: QuestionApi) {    private val listOfQuestions = ArrayList<QuestionItem>(emptyList())}
import React from 'react'

import styles from './main.module.css'
import Title from './Title'
import HandleInput from './HandleInput'
import RatingHistogram from './RatingHistogram'

export default function App() {
  return (
    <div className={styles['main-container']}>
      <Title />
      <HandleInput />
      <RatingHistogram />
    </div>
  )
}

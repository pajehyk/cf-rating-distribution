import React from 'react'

import styles from './main.module.css'

export default function HandleInput() {
    return (
        <div className={styles['cf-handle-div']}>
            <div className={styles['cf-handle__message']}>
                <span>enter your cf handle to get percentile:</span>
            </div>
            <input
                type="text"
                placeholder="cf handle"
                className={styles['cf-handle__text-input']}
            />
            <button className={styles['cf-handle__button']}>
                Submit
            </button>
        </div>
    )
}
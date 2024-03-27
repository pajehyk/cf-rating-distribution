import React, { useState, useEffect } from 'react';
import RatingHistogram from './RatingHistogram';

export default function RatingHistogramComponent() {
  const [data, setData] = useState(null);

  useEffect(() => {
    fetch('/ratings')
      .then(response => response.json())
      .then(json => setData(json))
      .catch(error => console.error(error));
  }, []);

  return (
    <div>
      {data ? <RatingHistogram xArg = {data["ratings"].map(rating=>rating.value)} /> : 'Loading...'}
    </div>
  );
}